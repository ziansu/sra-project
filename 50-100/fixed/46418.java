@io.github.mayhewsw.RequestMapping(value = "/toggledefs", method = RequestMethod.GET)
@io.github.mayhewsw.ResponseBody
public java.lang.String toggledefs(@io.github.mayhewsw.RequestParam(value = "taid")
java.lang.String taid, javax.servlet.http.HttpSession hs) {
    io.github.mayhewsw.SessionData sd = new io.github.mayhewsw.SessionData(hs);
    java.util.TreeMap<java.lang.String, edu.illinois.cs.cogcomp.core.datastructures.textannotation.TextAnnotation> tas = sd.tas;
    edu.illinois.cs.cogcomp.core.datastructures.textannotation.TextAnnotation ta = tas.get(taid);
    java.lang.Boolean showdefs = sd.showdefs;
    showdefs = !showdefs;
    hs.setAttribute("showdefs", showdefs);
    sd.showdefs = showdefs;
    return this.getHTMLfromTA(ta, sd);
}