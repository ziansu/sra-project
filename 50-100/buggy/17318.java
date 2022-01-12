private org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter createHeaderPainter(final org.jowidgets.spi.impl.swt.common.image.SwtImageRegistry imageRegistry) {
    final org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter imagePainter = new org.jowidgets.nattable.impl.plugin.JoColumnImagePainter(imageRegistry);
    final org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter textPainter = new org.jowidgets.nattable.impl.plugin.JoColumnTextPainter();
    final org.eclipse.nebula.widgets.nattable.painter.cell.decorator.CellPainterDecorator contentPainter = new org.eclipse.nebula.widgets.nattable.painter.cell.decorator.CellPainterDecorator(textPainter, org.eclipse.nebula.widgets.nattable.ui.util.CellEdgeEnum.LEFT, imagePainter);
    contentPainter.setSpacing(org.jowidgets.nattable.impl.plugin.NatTableImplSpi.PADDING);
    contentPainter.setPaintBackground(false);
    final org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator paddingPainter = new org.eclipse.nebula.widgets.nattable.painter.cell.decorator.PaddingDecorator(contentPainter, org.jowidgets.nattable.impl.plugin.NatTableImplSpi.COLUMN_VERTICAL_PADDING, org.jowidgets.nattable.impl.plugin.NatTableImplSpi.PADDING, 0, org.jowidgets.nattable.impl.plugin.NatTableImplSpi.PADDING, false);
    final org.jowidgets.nattable.impl.plugin.JoClickMovePaintDecorator klickMovePainter = new org.jowidgets.nattable.impl.plugin.JoClickMovePaintDecorator(paddingPainter);
    return new org.jowidgets.nattable.impl.plugin.JoColumnBackgroundPainter(klickMovePainter);
}