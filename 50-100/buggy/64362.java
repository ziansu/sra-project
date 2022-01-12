public static org.joda.time.DateTime dataFixer(proxi.model.objects.Article article, proxi.model.objects.Commentary commentary) {
    if (article.getDiary().contains("20minutos.es"))
        return proxi.model.DataFixer.minutosCommentaryDateText2DateTime(commentary);
    else
        if (article.getDiary().contains("elpais.com"))
            return proxi.model.DataFixer.paisCommentaryDateText2DateTime(commentary);
        else
            if (article.getDiary().contains("elmundo.es"))
                return proxi.model.DataFixer.mundoCommentaryDateText2DateTime(commentary);
            
        
    
    return null;
}