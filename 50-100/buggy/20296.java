@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplication(), com.lgq.fruitgrower.view.act.PublicActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putBoolean("farmer", true);
    intent.putExtras(bundle);
    startActivityForResult(intent, 1);
    overridePendingTransition(R.anim.in_from_down, R.anim.out_to_up);
    if ((rela_layout.getVisibility()) == (android.view.View.VISIBLE)) {
        rela_layout.setVisibility(View.GONE);
    }
}