@retrofit2.http.GET(value = "api/transporter/{id}/package")
retrofit2.Call<java.util.List<br.com.rodrigues.murilo.mtrack.domain.model.SalesOrderPackage>> getSalesOrderPackage(@retrofit2.http.Path(value = "id")
java.lang.String id);