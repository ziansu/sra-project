@butterknife.OnClick(value = R.id.add_choice_button)
public void setAddChoiceButton() {
    mChoicesList.add(new com.example.sammengistu.stuck.model.Choice("", 0));
    mAdapter = new com.example.sammengistu.stuck.adapters.MyPostChoiceAdapter(mChoicesList, this, mAddChoiceButton);
    mMyChoicesRecyclerView.setAdapter(mAdapter);
    mAdapter.notifyDataSetChanged();
    if ((mChoicesList.size()) == 4) {
        mAddChoiceButton.setVisibility(View.INVISIBLE);
        mAddChoiceButton.setEnabled(false);
    }
}