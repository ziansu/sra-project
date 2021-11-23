@java.lang.Override
public void finish() {
    android.content.Intent intent = new android.content.Intent();
    intent.putParcelableArrayListExtra("workList", toReturn);
    intent.putExtra("index", index);
    setResult(anvenkat.calpoly.edu.studybuddiesv02.RESULT_OK, intent);
    super.finish();
}