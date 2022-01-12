@java.lang.Override
public void handle(javafx.event.ActionEvent arg0) {
    vozidla.Vozidlo vybraneVozidlo = sklad.getVozidlo(vyberVozidla.getValue());
    controller.Pobocka vybranaPobocka = controller.ZoznamBudov.najdiPobocku(vyberPobocky.toString());
    vybraneVozidlo.setZasielky(sklad.triedZasielky(vyberPobocky.toString()));
    vybraneVozidlo.odovzdajZasielky(vybranaPobocka);
}