@java.lang.Override
public void success(org.esn.mobilit.models.Countries result, retrofit.client.Response response) {
    org.esn.mobilit.services.CountriesService.countries = result;
    org.esn.mobilit.utils.Utils.saveObjectToCache(org.esn.mobilit.MobilITApplication.getContext(), "countries", org.esn.mobilit.services.CountriesService.countries);
    org.esn.mobilit.utils.Utils.setDefaults(org.esn.mobilit.MobilITApplication.getContext(), "revision", org.esn.mobilit.services.CountriesService.countries.getRevision());
    callback.onSuccess(org.esn.mobilit.services.CountriesService.countries);
}