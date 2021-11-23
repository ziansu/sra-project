@org.junit.Test
public void ElfoVerdeAtiraFlechaERecebe2deXP() {
    ElfosVerdes teste = new ElfosVerdes("Arthur");
    teste.atirarFlechaDeVidro(new Dwarf());
    assertEquals(2, teste.getExperiencia());
}