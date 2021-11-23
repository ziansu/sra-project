@java.lang.Override
public java.lang.StringBuilder toHtml(java.lang.StringBuilder sb) {
    synchronized(tasks) {
        sb.append(org.openstreetmap.josm.tools.Utils.firstNonNull(name, ""));
        if (!(tasks.isEmpty())) {
            sb.append("<ul>");
            for (org.openstreetmap.josm.gui.SplashScreen.Task i : tasks) {
                sb.append("<li>");
                i.toHtml(sb);
                sb.append("</li>");
            }
            sb.append("</ul>");
        }
        return sb;
    }
}