@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.kaylaflaten.organicfarm.CropViewer.class);
    intent.putExtra("section", secN);
    intent.putExtra("bed", bedN);
    intent.putExtra("itemSelected", cropID);
    startActivity(intent);
}