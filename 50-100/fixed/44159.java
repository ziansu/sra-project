@java.lang.Override
public void onClick(android.view.View v) {
    if (((!(isKoma)) && (checker)) || (akhir)) {
        inputText.setText("0.");
        isKoma = true;
    }else
        if (!(isKoma)) {
            inputText.setText(((inputText.getText()) + "."));
            isKoma = true;
        }
    
    cekk = true;
    akhir = false;
    isKuadrat = false;
    isAkar = false;
}