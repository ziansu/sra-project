@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sobre);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    textViewsobre = ((android.widget.TextView) (findViewById(R.id.txtsobre)));
    textViewsobre.setText("A imobiliária LuxVilla especializou-se na venda de imóveis de luxo em terras portuguesas. Começou a sua caminhada em 2003 na cidade do Porto, oferecendo aos seus compradores varias tipologias com vistas alternativas sobre aquela que é apelidada de cidade invicta. Em 2008, ano em que abrangemos a cidade de Braga, também conhecida por Bracara Augusta sempre seguindo ideais de qualidade e de excelência. Querendo cada vez mais, levar o seu nome a outros níveis 7 anos mais tarde , depois de Braga, chegamos à denominada “ Veneza portuguesa”, Aveiro, a cidade dos ovos moles, onde nos encontramos ainda em fase de expansão mas sempre com o objetivo de oferecer o melhor.");
    textViewsobre2 = ((android.widget.TextView) (findViewById(R.id.txtsobre2)));
    textViewsobre2.setText("Ás primeiras semanas do decorrer de 2015 e de mãos dadas com a “Douro Azul”, iniciamos uma parceria. Em que, alternadamente, a equipa de vendas visita semanalmente os cruzeiros da mesma, onde apresenta os imoveis que temos à disposição daqueles que queiram usufruir do solo português.");
}