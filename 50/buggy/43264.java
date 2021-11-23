@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this.ctx, com.example.ofir.bopofinal.Administrator.ManageCategoriesActivity.class);
    this.ctx.startActivity(intent);
}