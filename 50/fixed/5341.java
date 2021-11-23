@org.junit.Test
public void ElfoVerdeAtiraFlechaEPerdeUmaFlecha() {
    ElfosVerdes teste = new ElfosVerdes();
    teste.atirarFlechaDeVidro(new Dwarf());
    int quantFlechas = teste.getFlechaDeVidro().getQuantidade();
    assertEquals(41, quantFlechas);
}