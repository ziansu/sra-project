private void adicionaPessoa(com.devmob.contacomigo.model.Pessoa pessoa, com.devmob.contacomigo.model.Produto produto) {
    double price = produtos.get(produto.getId()).getPreco();
    java.util.List<com.devmob.contacomigo.model.Pessoa> consumidores = produtos.get(produto.getId()).getConsumidores();
    consumidores.add(pessoa);
    for (com.devmob.contacomigo.model.Pessoa person : consumidores) {
        person.setPrecoTotal((price / (consumidores.size())));
    }
}