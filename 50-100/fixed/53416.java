@java.lang.Override
public void transform(java.util.List<? extends functions.Mapping> maps) {
    for (functions.Mapping m : maps) {
        if (m instanceof functions.TextualMapping) {
            functions.TextualMapping tm = ((functions.TextualMapping) (m));
            try {
                if ((tm.getAttributeName().equals(attribute)) && (tm.contains(data))) {
                    data = tm.map(attribute, data);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return ;
            }
        }
    }
}