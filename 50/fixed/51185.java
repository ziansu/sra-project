@org.junit.Test
public void concatenateColumns() {
    org.eclipse.january.dataset.IDataset h1 = org.eclipse.january.dataset.DatasetUtils.concatenate(new org.eclipse.january.dataset.IDataset[]{ a , b }, 1);
    java.lang.System.out.println(("Concatenate (already done!) " + h1));
}