@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    android.widget.TextView name = ((android.widget.TextView) (v.findViewById(R.id.name)));
    android.content.Intent intent = new android.content.Intent(v.getContext(), com.mbm.ftn.mbm.activities.NumbersActivity.class);
    intent.putExtra("city", name.getText().toString());
    v.getContext().startActivity(intent);
    com.mbm.ftn.mbm.adapters.FragmentManager fragmentManager = ((com.mbm.ftn.mbm.activities.ImportantNumbersActivity) (parent.getContext())).getSupportFragmentManager();
}