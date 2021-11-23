private void startActivity(int i) {
    android.os.Bundle bundle;
    android.content.Intent intent;
    bundle = new android.os.Bundle();
    bundle.putInt("room", 0);
    intent = new android.content.Intent(this, hevs.project.SketchAgenda.class);
    intent.putExtras(bundle);
    this.startActivity(intent);
    finish();
}