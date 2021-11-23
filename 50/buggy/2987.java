@java.lang.Override
public void onClick(int position) {
    com.example.nguyennam.financialbook.utils.FileHelper.writeFile(context, filename, ("" + (++position)));
    ((com.example.nguyennam.financialbook.MainActivity) (context)).replaceFragment(new com.example.nguyennam.financialbook.accounttab.EditAccount(), true);
}