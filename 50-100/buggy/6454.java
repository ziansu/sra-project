@java.lang.Override
public void writeData(cell_potts_model.CellPottsModel model, int time) {
    writer.println();
    int q = model.getTypesOfSpin();
    writer.printf("%.8f ", ((double) (time)));
    for (int i = 1; i <= q; i++) {
        writer.printf("%.8f %.8f ", model.getXCM(i), model.getYCM(i));
    }
}