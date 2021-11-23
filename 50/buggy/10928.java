public void done(reli.reliapp.co.il.reli.dataStructures.Discussion currentDiscussion, com.parse.ParseException e) {
    if (e == null) {
        fetchDiscussionInformation(v, currentDiscussion);
    }
    dia.dismiss();
}