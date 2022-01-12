@org.junit.Test
public void ElfoVerdeAtira42FlechasEPerdeTodasFlechas() {
    ElfosVerdes teste = new ElfosVerdes();
    for (int i = 0; i < 42; i++)
        teste.atirarFlechaDeVidro(new Dwarf());
    
    int quantFlechas = teste.getFlechaDeVidro().getQuantidade();
    assertEquals(0, quantFlechas);
}