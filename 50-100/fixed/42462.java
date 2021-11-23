@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, in.org.klp.kontact.Reports.class);
    intent.putExtra("surveyId", surveyId);
    intent.putExtra("surveyName", surveyName);
    intent.putExtra("bid", bid);
    intent.putExtra("boundary", (((((district.toUpperCase()) + ", ") + (block.toUpperCase())) + ", ") + (cluster.toUpperCase())));
    startActivity(intent);
}