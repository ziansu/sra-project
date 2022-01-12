public static void main(java.lang.String[] args) {
    Apelsinas apelsinas = new Apelsinas();
    java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Įveskite apelsino skersmenį: ");
    apelsinas.setA(reader.nextDouble());
    java.lang.System.out.println("Įveskite apelsino žievelės storį: ");
    apelsinas.setD(reader.nextDouble());
    apelsinas.getTuris();
    java.lang.System.out.println(apelsinas.getTuris());
}