@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(v.getContext(), ("button clicked: " + (v.getId())), Toast.LENGTH_SHORT).show();
    android.content.Intent chosenAlgorithm = new android.content.Intent(v.getContext(), edu.josesanchez1csumb.algorithmsapp.AlgorithmChosen.class);
    android.os.Bundle info = new android.os.Bundle();
    info.putInt("row_id", v.getId());
    chosenAlgorithm.putExtras(info);
    startActivity(chosenAlgorithm);
}