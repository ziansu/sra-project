@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String inputVar2;
    inputVar2 = input.getText().toString();
    com.moritz.SciProSpr.sciprospr.DataColumn dc = dataColumns2.get(j);
    dc.addValue(inputVar2);
    dataColumns2.set(j, dc);
    imm.hideSoftInputFromWindow(input.getWindowToken(), 0);
}