@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    binding.getPoll().setPageId(pages.get(which).get_id());
    final com.vandenbussche.emiel.projectsbp.models.Poll poll = binding.getPoll().toPoll();
    uploadPoll(pages.get(which).getTitle());
}