public void passToDetail(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, com.mycompany.fureverfriend.DetailView.class);
    android.widget.TextView txtBottom = ((android.widget.TextView) (view.findViewById(R.id.bottomtext)));
    java.lang.String id = txtBottom.getText().toString();
    android.util.Log.d("MESSSAGE", "PetDetail");
    i.putExtra("id", id);
    startActivity(i);
}