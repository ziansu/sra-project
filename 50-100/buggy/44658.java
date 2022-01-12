@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    java.lang.String S = java.lang.String.valueOf(b);
    android.util.Log.d("ProblemSelector.java", ("Line: 47 : " + S));
    if (b) {
        AddProb = true;
        setAddProb(true);
        android.widget.Toast.makeText(getBaseContext(), "Addition: True", Toast.LENGTH_SHORT).show();
    }else {
        AddProb = false;
        setAddProb(false);
        android.widget.Toast.makeText(getBaseContext(), "Addition: False", Toast.LENGTH_SHORT).show();
    }
}