private static void BuscarDni() {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Buscar persona por DNI \nIntroduce el DNI:");
    java.lang.String dni = scan.next();
    if (persona.MainPersona.mapIdPersona.containsKey(dni)) {
        java.lang.System.out.println(("Usuario " + (persona.MainPersona.mapDniPersona.get(dni))));
    }else {
        java.lang.System.out.println("Dni introducida es incorrecta");
    }
}