@org.junit.Test
public void ElfoVerdeAtira42FlechasEXpFica84() {
    ElfosVerdes teste = new ElfosVerdes();
    for (int i = 0; i < 42; i++)
        teste.atirarFlechaDeVidro(new Dwarf());
    
    assertEquals(84, teste.getExperiencia());
}