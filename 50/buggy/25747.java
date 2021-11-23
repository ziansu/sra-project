private void applyClickEvents(com.linked_sys.hasatraining.adapters.TeacherAttendProgramsAdapter.MyViewHolder holder, final int position) {
    holder.courseRow.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            listener.onProgramRowClicked(position);
        }
    });
}