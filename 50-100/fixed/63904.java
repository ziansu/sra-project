@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.ok :
            in.silive.clime.Fragments.DialogSearch.search = city.getText().toString();
            android.util.Log.d("TAG", ("user's search request : " + (in.silive.clime.Fragments.DialogSearch.search)));
            setSearch(in.silive.clime.Fragments.DialogSearch.search);
            dismiss();
            break;
        case R.id.cancel :
            dismiss();
            break;
    }
}