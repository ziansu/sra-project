@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.example.andykhuu.apcomputerscienceprep.SolutionActivity.class);
    if ((selected) == (correctAnswer)) {
        i.putExtra("CORRECT", true);
    }else
        if ((selected) != (correctAnswer)) {
            i.putExtra("CORRECT", false);
        }
    
    if ((selected) != (-1)) {
        startActivity(i);
    }
}