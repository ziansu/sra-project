private void notifyLabDetailsAdapter() {
    objectArrayList.clear();
    objectArrayList.addAll(org.wizbots.labtab.database.ProgramStudentsTable.getInstance().getStudentsListByProgramId(programOrLab.getId()));
    labDetailsAdapter.notifyDataSetChanged();
    progressDialog.dismiss();
}