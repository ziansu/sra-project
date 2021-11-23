public void saveHTML(android.view.View view) {
    cs246.ilearntracker.Student.getInstance().setHTMLData(HTMLData);
    java.lang.System.out.println(cs246.ilearntracker.Student.getInstance().getHTMLData());
    android.content.Intent intent = new android.content.Intent(this, cs246.ilearntracker.iLearnTracker.class);
    startActivity(intent);
}