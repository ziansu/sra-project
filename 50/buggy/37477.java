@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.nutricampus.app.activities.CadastrarPropriedadeActivity.class);
    startActivity(intent);
    this.finish();
}