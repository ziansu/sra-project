public java.util.List<ar.com.textillevel.modulos.odt.to.intercambio.ODTEagerTO> getOrdenesDeTrabajo(java.lang.Integer idEstado, java.util.Date fechaDesde, java.util.Date fechaHasta) {
    java.util.List<ar.com.textillevel.modulos.odt.entidades.OrdenDeTrabajo> odts = odtFacade.getOrdenesDeTrabajoSinSalida(ar.com.fwcommon.util.DateUtil.toDate(fechaDesde), ar.com.fwcommon.util.DateUtil.toDate(fechaHasta));
    java.util.List<ar.com.textillevel.modulos.odt.to.intercambio.ODTEagerTO> result = new java.util.ArrayList<ar.com.textillevel.modulos.odt.to.intercambio.ODTEagerTO>(odts.size());
    for (ar.com.textillevel.modulos.odt.entidades.OrdenDeTrabajo odt : odts) {
        result.add(new ar.com.textillevel.modulos.odt.to.intercambio.ODTEagerTO(odt, transicionODTDAO.getAllEagerByODT(odt.getId())));
    }
    return result;
}