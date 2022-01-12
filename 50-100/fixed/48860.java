void solicitarInformacoes() throws java.io.IOException {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Digite o nome do primeiro jogador: ");
    java.lang.String j1 = input.nextLine();
    java.lang.System.out.print("Digite o nome do segundo jogador: ");
    java.lang.String j2 = input.nextLine();
    salvarJogo(j1, 0, j2, 0);
    batalhanaval.BatalhaNaval b = new batalhanaval.BatalhaNaval();
}