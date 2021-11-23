@org.junit.Before
public void setUp() throws java.lang.Exception {
    setView = new GUI.SetView(null);
    set = new Interval.Set("New");
    setView.createSidePanel();
    setView.createInputFields();
    setView.displayInterval(set);
}