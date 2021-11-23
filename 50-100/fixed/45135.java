public static void escEditingWhenMouseDownElsewhere(com.google.gwt.core.client.JavaScriptObject targ) {
    com.google.gwt.dom.client.Element el = null;
    try {
        el = com.google.gwt.dom.client.Element.as(targ);
        el.addClassName("geogebraHover");
    } catch (java.lang.Exception ec) {
    }
    if (el != null) {
        org.geogebra.web.html5.main.DrawEquationWeb.currentHover.removeClassName("geogebraHover");
        org.geogebra.web.html5.main.DrawEquationWeb.currentHover = el;
    }
    if ((org.geogebra.web.html5.main.DrawEquationWeb.currentWidget) != null) {
        if (org.geogebra.web.html5.main.DrawEquationWeb.targetHasFeature(targ, org.geogebra.web.html5.main.DrawEquationWeb.currentWidget.getElement(), "MouseDownDoesntExitEditingFeature")) {
            return ;
        }
        org.geogebra.web.html5.main.DrawEquationWeb.escEditingEquationMathQuillGGB(org.geogebra.web.html5.main.DrawEquationWeb.currentWidget, org.geogebra.web.html5.main.DrawEquationWeb.currentElement);
    }
}