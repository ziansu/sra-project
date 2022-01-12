@java.lang.Override
public void eventCallback(ru.timuruktus.SApp.BaseEvent event) {
    if (event instanceof ru.timuruktus.SApp.BackendlessPart.EGetMagazinesList) {
        ru.timuruktus.SApp.MagazinePart.EGetMagazines currentEvent = ((ru.timuruktus.SApp.MagazinePart.EGetMagazines) (event));
        java.util.List<ru.timuruktus.SApp.MagazinePart.Magazine> magazineList = currentEvent.getMagazines();
        java.util.ArrayList<ru.timuruktus.SApp.MagazinePart.Magazine> magazineArrayList = ((java.util.ArrayList<ru.timuruktus.SApp.MagazinePart.Magazine>) (magazineList));
        eGetMagazines.setMagazines(magazineArrayList);
        eGetMagazines.callback();
    }
}