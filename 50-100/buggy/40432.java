public void takeTurn(android.view.View view) {
    if (!(checkBusy(view))) {
        if (((mTurnDate) != null) && ((java.util.Calendar.getInstance().compareTo(mTurnDate)) < 0)) {
            android.widget.Toast.makeText(getContext(), "Can't take a turn in the future", Toast.LENGTH_LONG).show();
            mTurnDate = null;
        }else {
            mTakeTurnAsyncTask = new me.geniusburger.turntracker.TurnFragment.TakeTurnAsyncTask(getActivity(), view, mTurnDate);
            mTakeTurnAsyncTask.execute();
        }
    }
}