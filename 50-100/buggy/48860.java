void solicitarInformacoes() throws java.io.IOException {
    batalhanaval.BatalhaNaval principal = new batalhanaval.BatalhaNaval();
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Digite o nome do primeiro jogador: ");
    java.lang.String j1 = input.nextLine();
    java.lang.System.out.print("Digite o nome do segundo jogador: ");
    java.lang.String j2 = input.nextLine();
    salvarJogo(j1, 0, j2, 0);
    carregarDados();
}