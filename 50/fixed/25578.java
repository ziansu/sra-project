@java.lang.Override
protected void neustart() {
    zustandNr = 0;
    vertaucheSchalter();
    textField.setText((((zustaende[zustandNr]) + ":") + ((zustaende.length) - (zustandNr))));
}