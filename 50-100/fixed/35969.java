private void adicionaPessoa(com.devmob.contacomigo.model.Pessoa pessoa, com.devmob.contacomigo.model.Produto produto) {
    double price = produto.getPreco();
    java.util.List<com.devmob.contacomigo.model.Pessoa> consumidores = produto.getConsumidores();
    consumidores.add(pessoa);
    for (com.devmob.contacomigo.model.Pessoa person : consumidores) {
        person.setPrecoTotal((price / (consumidores.size())));
    }
}