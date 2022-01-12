@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.moritz.SciProSpr.sciprospr.DataColumn dc = dataColumns2.get(j);
    dc.addValue("No comment");
    dataColumns2.set(j, dc);
    imm.hideSoftInputFromWindow(input.getWindowToken(), 0);
    (j)++;
}