public void contextInitialized(javax.servlet.ServletContextEvent arg0) {
    com.yyy.dao.HBaseUtils.init();
    com.yyy.dao.HBaseDAO.init();
    java.lang.String resourcePath = ((arg0.getServletContext().getRealPath("/")) + "resource") + (java.io.File.separator);
    edu.stanford.nlp.Tagging.init(resourcePath);
    com.mechaglot_Alpha2.controller.Calculate.init(resourcePath);
}