@java.lang.Override
public void onResponse(retrofit2.Call<java.util.ArrayList<com.blocksolid.okrello.model.TrelloChecklist>> cardCall, retrofit2.Response<java.util.ArrayList<com.blocksolid.okrello.model.TrelloChecklist>> response) {
    com.blocksolid.okrello.KeyResultsActivity.trelloCard.setChecklists(response.body());
    com.blocksolid.okrello.KeyResultsActivity.keyResults = com.blocksolid.okrello.KeyResultsActivity.trelloCard.getKeyResultsCheckitems();
    keyResultAdapter.updateData(com.blocksolid.okrello.KeyResultsActivity.keyResults);
    com.blocksolid.okrello.KeyResultsActivity.keyresProgressBar.setVisibility(View.INVISIBLE);
}