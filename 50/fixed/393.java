@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    selectedSkills.remove(position);
    displaySkillAdapter.notifyDataSetChanged();
}