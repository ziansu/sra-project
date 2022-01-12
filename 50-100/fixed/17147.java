public void start() {
    Jets.Hangar hangar = new Jets.Hangar();
    Jets.PilotDorm d = new Jets.PilotDorm();
    Jets.Pilot[] pilots = pilotList();
    d.setPilot(pilots);
    Jets.Jet[] jets = jetList(pilots);
    hangar.setJets(jets);
    Jets.InputManager input = new Jets.InputManager();
    input.chooseMenuOption(hangar, d);
}