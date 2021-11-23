public static void main(java.lang.String[] args) {
    Apelsinas apelsinas = new Apelsinas();
    java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Įveskite apelsino skersmenį: ");
    apelsinas.setD(reader.nextDouble());
    java.lang.System.out.println("Įveskite apelsino žievelės storį: ");
    apelsinas.setA(reader.nextDouble());
    java.lang.System.out.println(apelsinas.getTuris());
}