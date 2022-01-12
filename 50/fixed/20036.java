private void addBuilding() {
    tk.ubublik.redivansion.gamelogic.units.objects.Office office = new tk.ubublik.redivansion.gamelogic.units.objects.Office();
    if (mapManager.putObjectCenter(office))
        java.lang.System.out.println(("Object created at " + (office.getPosition())));
    
}