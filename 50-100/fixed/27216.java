@java.lang.Override
public void run() {
    java.lang.System.out.println("Iniciar Escucha!!!");
    while (estado) {
        java.lang.String content = correos.acropolis.correo.ClientePOP.readMail();
        if (content != null) {
            java.lang.System.out.println("Llego Correo!!!");
            new correos.acropolis.CorreosTecno.HiloAtencion(content).start();
        }
        waitCiclo();
    } 
    java.lang.System.out.println("Terminar Escucha!!!");
}