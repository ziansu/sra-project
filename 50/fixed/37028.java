@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    send(((edu.byui.cs246.scandroid.Scanner) (o)).getScan());
}